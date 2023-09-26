package function

// Handle a function invocation
func Handle(req Request) Response {
	return Response{Type: 1, Body: req.Message}
}
