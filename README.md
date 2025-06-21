# 💬 Java LAN Chat Application

A simple and powerful **multithreaded LAN chat application** built using **Java socket programming**. This console-based application allows multiple clients to connect to a server and communicate with each other in real-time over a local network.

---

## 🚀 Features

- 🔌 Real-time messaging between multiple clients
- 💬 Console-based chat interface
- 🧵 Multithreaded server handles each client separately
- 📡 Socket programming using TCP/IP
- 📦 Lightweight and no external libraries

---

## 🛠️ Technologies Used

- Java
- TCP Sockets
- Multithreading (Java Threads)
- Buffered I/O Streams

---

## 📁 Project Structure


---

## 🖥️ How It Works

- **Server** listens on a specific port (e.g., 12345)
- **Clients** connect to the server using IP and port
- Messages from a client are broadcast to all connected clients via the server

---

## ✅ Getting Started

### 1. Compile the files

---bash
javac ChatServer.java
javac ChatClient.java

java ChatServer
java ChatClient

Server:
nginx
Copy
Edit
Chat server started...
New client connected: Socket[addr=/127.0.0.1,port=56789]

Client:
arduino
Copy
Edit
Connected to chat server... Type your messages:
Hello everyone!
Client[56789]: Hello everyone!
