int elevatorRequests(int n, int* requests, int requestsSize) {
    int s= 0;
    s=s+abs(0-requests[0]);
    for(int i=1;i<requestsSize;i++)
    s=s+abs(requests[i-1]-requests[i]);
    return s;
}