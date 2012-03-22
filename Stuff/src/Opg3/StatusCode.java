package Opg3;

public enum StatusCode {HTTP100("Continue", 100),
  HTTP101("Switching Protocols", 101), 
  HTTP200("OK", 200), 
  HTTP201("Created", 201), 
  HTTP202("Accepted", 202), 
  HTTP203("Non-Authoritative Information", 203), 
  HTTP204("No Content", 204), 
  HTTP205("Reset Content", 205), 
  HTTP206("Partial Content", 206), 
  HTTP300("Multiple Choices", 300), 
  HTTP301("Moved Permanently", 301), 
  HTTP302("Found", 302), 
  HTTP303("See Other", 303), 
  HTTP304("Not Modified", 304), 
  HTTP305("Use Proxy", 305),
  HTTP307("Temporary Redirect", 307), 
  HTTP400("Bad Request", 400), 
  HTTP401("Unauthorized", 401), 
  HTTP402("Payment Required", 402), 
  HTTP403("Forbidden", 403), 
  HTTP404("Not Found", 404), 
  HTTP405("Method Not Allowed", 405), 
  HTTP406("Not Acceptable", 406), 
  HTTP407("Proxy Authentication Required", 407), 
  HTTP408("Request Time-out", 408), 
  HTTP409("Conflict", 409), 
  HTTP410("Gone", 410), 
  HTTP411("Length Required", 411), 
  HTTP412("Precondition Failed", 412), 
  HTTP413("Request Entity Too Large", 413), 
  HTTP414("Request-URI Too Large", 414), 
  HTTP415("Unsupported Media Type", 415), 
  HTTP416("Requested range not satisfiable", 416), 
  HTTP417("Expectation Failed", 417), 
  HTTP500("Internal Server Error", 500), 
  HTTP501("Not Implemented", 501), 
  HTTP502("Bad Gateway", 502), 
  HTTP503("Service Unavailable", 503), 
  HTTP504("Gateway Time-out", 504), 
  HTTP505("HTTP Version not supported", 505);             

  private String description;
  private int httpNumber;
  
  StatusCode(String s, int i){
    description = s;
    httpNumber = i;
  }
  
  public String getDescription(){
    return (httpNumber + " " + description);
  }
}
