# Todo
Simple todo list in springboot 
Api to call 
1.create :-localhost:8181/api/v1/task/create {Method:POST}
sample payload 
{
	
	"name":"Go Home",
	"description":"Be home before 5pm"
}  
response is the task it [which is a UUID] eg . ff808181707e282601707e28ef970006

2.getTaskById :- localhost:8181/api/v1/task/ff808181707e282601707e28ef970006  {Method:GET}
response data 
{
    "name": "Go Home",
    "description": "Be home before 5pm",
    "userId": null,
    "createdOn": "2020-02-25T21:02:57.000+0000"
} 
3.getAllTasksById :-localhost:8181/api/v1/task/all {Method:GET} 
[
    {
        "name": "Go Home",
        "description": "Be home before 5pm",
        "userId": null,
        "createdOn": "2020-02-25T21:02:21.000+0000"
    },
    {
        "name": "Go Home",
        "description": "Be home before 5pm",
        "userId": null,
        "createdOn": "2020-02-25T21:02:38.000+0000"
    },
    {
        "name": "Go Home",
        "description": "Be home before 5pm",
        "userId": null,
        "createdOn": "2020-02-25T21:02:48.000+0000"
    },
    {
        "name": "Go Home",
        "description": "Be home before 5pm",
        "userId": null,
        "createdOn": "2020-02-25T21:02:50.000+0000"
    },
    {
        "name": "Go Home",
        "description": "Be home before 5pm",
        "userId": null,
        "createdOn": "2020-02-25T21:02:52.000+0000"
    },
    {
        "name": "Go Home",
        "description": "Be home before 5pm",
        "userId": null,
        "createdOn": "2020-02-25T21:02:54.000+0000"
    },
    {
        "name": "Go Home",
        "description": "Be home before 5pm",
        "userId": null,
        "createdOn": "2020-02-25T21:02:57.000+0000"
    }
]

