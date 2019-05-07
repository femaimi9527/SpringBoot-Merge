#### 示例:
##### 1.统一数据返回格式示例
```$xslt
简介: https://blog.csdn.net/qq_29668759/article/details/89639058
url: /api/example/responseDate
代码: com.spboot.merge.example.ExampleController.responseDataExample()

返回示例：
{
  "success": true,
  "datas": [
    {
      "exampleId": 1,
      "exampleName": "name1"
    },
    {
      "exampleId": 2,
      "exampleName": "name2"
    }
  ]
}
```
##### 2.统一异常返回示例
```$xslt
/api/example/baseException
com.spboot.merge.example.ExampleController.baseExceptionExample()

返回示例：
{
  "success": false,
  "errorMsg": "0不能做被除数！"
}
```

