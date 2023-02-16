fun main(){
var school = "AkiraChix"
println(school[1]+""+school[3]+""+school[4])
printname("ruth",19)
getlength("I love it" )
 println(truename("caren"))



}
fun printname(name:String,age:Int):String{
val statement = "Hi, my name is $name and I am $age years old"
return statement

}
fun getlength(length:String):Int{
    val length = length.length
    return length
}
fun truename(name:String){
 val r = "ruth"
 if (r==(name))
     println("That's me!")
    else
        println("I don't know who that is")
}
