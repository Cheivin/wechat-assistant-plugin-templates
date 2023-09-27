package function

// Handle a function invocation
func Handle(req Request) Response {
	return Response{Type: Text, Body: req.Message}
}

func Info() Plugin {
	return Plugin{Keyword: "唤醒词", Description: "插件描述"}
}
