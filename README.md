# cursor-poc-repo

## Overview
This repository contains MCP (Model Context Protocol) server configurations for MuleSoft platform integration.

## Security Notice
⚠️ **WARNING**: The `mcp.json` file contains sensitive credentials. These should be replaced with your own credentials and ideally stored as environment variables in production environments.

## Setup
1. Copy `.env.example` to `.env` and fill in your actual credentials
2. Ensure your environment variables are properly configured
3. Never commit `.env` files or credentials to version control

## Configuration
The `mcp.json` file configures two MCP servers:
- **mulesoft-platform**: Uses environment variables for credentials
- **brillio-deployed-case-details**: Uses header-based authentication

For production use, consider storing all credentials as environment variables and loading them securely.