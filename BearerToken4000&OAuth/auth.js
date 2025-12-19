const employees = require("./employees");

module.exports = (req, res, next) => {
  const authHeader = req.headers.authorization;

  if (!authHeader || !authHeader.startsWith("Bearer ")) {
    return res.status(401).json({
      error: "Bearer token required"
    });
  }

  const token = authHeader.replace("Bearer ", "");
  const employee = employees[token];

  if (!employee) {
    return res.status(403).json({
      error: "Invalid employee token"
    });
  }

  // Attach employee info to request
  req.employee = employee;
  next();
};

