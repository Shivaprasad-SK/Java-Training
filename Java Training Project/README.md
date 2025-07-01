# Java Multi-Client Screenshot Server & Client

This project demonstrates a simple Java server and client setup for remote screenshot collection. The server can request screenshots from all connected clients with a single button click.

## How It Works

- **Server:**

  - Opens a window with a "Screen Shot" button.
  - Waits for clients to connect.
  - When you click the button, it sends a request to all connected clients.
  - Receives screenshots from clients and saves them as PNG files.

- **Client:**
  - Connects to the server.
  - Waits for the server to request a screenshot.
  - Takes a screenshot of the client’s screen and sends it to the server.

## How to Run

### 1. Compile the Code

Open a terminal in the project directory and run:

```sh
javac Server.java
javac Client.java
```

### 2. Start the Server

```sh
java Server
```

A window will appear with a "Screen Shot" button.

### 3. Start One or More Clients

In separate terminals (or on different machines), run:

```sh
java Client
```

### 4. Request Screenshots

Click the "Screen Shot" button in the server window.  
All connected clients will send their screenshots, which are saved as `screenshot0.png`, `screenshot1.png`, etc.

## Requirements

- Java 8 or higher
- All clients and the server must be able to connect over the network (default is `localhost` and port `1000`).

## Notes

- Screenshots are saved in the same folder as the server.
- You can run multiple clients at once.
- The client code currently connects to `127.0.0.1` (localhost). Change this in `Client.java` if your server is on a different machine.
