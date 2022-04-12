package day10_NastedIf;

public class StatusCode {
    public static void main(String[] args) {
        int statusCode=307;
        String result=(statusCode==200)?"OK":(statusCode==201)?"Created":(statusCode==202)?"Accepted"
                :(statusCode==301)?"Moved Permanently":(statusCode==303)?"See Other":
                (statusCode==304)?"Not Modified" :(statusCode==307)?"Temporary Redirect"
                        :(statusCode==400)?"Bad Request":(statusCode==401)?"Unauthorized"
                :(statusCode==403)?"Forbidden":(statusCode==404)?"Not Found"
                        :(statusCode==410)?"Gone":(statusCode==500)?"Internal Server Error"
                        :"Service Unavailable";
        System.out.println("result = " + result);



    }
}
