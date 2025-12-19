// server.js
const path = require("path");
const fs = require("fs");

// JSON Server code without needing global module issues
const { create, defaults, router: jsonRouter, bodyParser } = require("json-server");

// Resolve path to users.json
const usersFile = path.join(__dirname, "users.json");

// Check if users.json exists
if (!fs.existsSync(usersFile)) {
  console.error("Error: users.json not found in the same folder!");
  process.exit(1);
}

const server = create();
const router = jsonRouter(usersFile);
const middlewares = defaults();

// Apply default middlewares
server.use(middlewares);

// Body parser for POST/PUT requests
server.use(bodyParser);

// Basic Auth middleware
server.use((req, res, next) => {
  if (req.path === "/login") return next();

  const authHeader = req.headers["authorization"];
  if (!authHeader || !authHeader.startsWith("Basic ")) {
    return res.status(401).json({ error: "No Basic auth provided" });
  }

  const base64 = authHeader.split(" ")[1];
  const decoded = Buffer.from(base64, "base64").toString("utf8");
  const [username, password] = decoded.split(":");

  if (username === "ragav" && password === "1234") return next();

  return res.status(403).json({ error: "Invalid credentials" });
});

// Optional login route
server.post("/login", (req, res) => {
  const { username, password } = req.body;
  if (username === "ragav" && password === "1234") {
    return res.status(200).json({ message: "Login successful" });
  }
  return res.status(401).json({ error: "Invalid username or password" });
});

// Use JSON Server router
server.use(router);

// Start server on port 5000
server.listen(5000, () => {
  console.log("JSON Server running with BASIC AUTH on port 5000");
});

