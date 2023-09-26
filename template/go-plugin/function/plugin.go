package function

import handler "github.com/openfaas/templates-sdk/go-http"

type Request struct {
	Request *handler.Request `json:"-"`

	MsgID      string `json:"msgID"`
	UID        string `json:"uid"`
	Username   string `json:"username"`
	GID        string `json:"gid"`
	GroupName  string `json:"groupName"`
	Message    string `json:"message"`
	RawMessage string `json:"rawMessage"`
	MsgType    int    `json:"msgType"`
	Time       int64  `json:"time"`
}
type Response struct {
	Error    string `json:"error"`    // 错误信息，空表示没错误
	Type     int    `json:"type"`     // 回复类型 0:不回复,1:文本,2:图片,3:视频,4:文件
	Body     string `json:"body"`     // 回复内容,type=1时为文本内容,type=2/3/4时为资源地址
	Filename string `json:"filename"` // 文件名称
}
