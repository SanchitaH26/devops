from http.server import BaseHTTPRequestHandler, HTTPServer

PORT = 5020

class MyHandler(BaseHTTPRequestHandler):
    def do_GET(self):
        self.send_response(200)
        self.send_header("Content-type", "text/html")
        self.end_headers()
        
        response = "<h1>Hello from Docker Python Container</h1>"
        self.wfile.write(response.encode("utf-8"))

server = HTTPServer(("0.0.0.0", PORT), MyHandler)
print(f"Server running on port {PORT}...")
server.serve_forever()
