const jsonServer = require("json-server");
const server = jsonServer.create();
const router = jsonServer.router("users.json");
const middlewares = jsonServer.defaults();
const auth = require("./auth");

server.use(middlewares);
server.use(jsonServer.bodyParser);

// 🔒 Protect all APIs
server.use(auth);

// Routes
server.use(router);

server.listen(4000, () => {
  console.log("Employee Bearer Token API running on port 4000");
});

