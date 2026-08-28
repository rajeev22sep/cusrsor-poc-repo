#!/usr/bin/env bash
set -euo pipefail

echo "==> Verifying Java toolchain"
java -version
javac -version

echo "==> Verifying Node.js toolchain"
node --version
npm --version

echo "==> Pre-caching MuleSoft MCP server"
npx -y @mulesoft/mcp-server --help > /dev/null

echo "==> Compiling Java sources when present"
if compgen -G "*.java" > /dev/null; then
  javac ./*.java
  echo "Java compilation successful"
else
  echo "No Java sources on this branch; skipping compile"
fi

echo "==> Environment setup complete"
