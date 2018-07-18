fun main(args: Array<String>) {
 println("Enter a number - ")
	//var n:Double = readLine()!!.toDouble()
	var n:Int = readLine()!!.toInt()
    //factorial(n)
	//println("гамма "+Gamma(n+1))
    var result:Int
	result = ff(n);
	println(result);
}
 
/*fun factorial(n: Double){
	var result:Double = 1.0;
 if(n>0.0){
    
    for(d in 1..n){
        result *= d
		
    }}else if(n==0.0){result=1.0}
	else if(n<0){println("бесконечность")
 result=0.0}
    println("Factorial of $n is equal to $result")
}

fun Gamma (n:Double):Double{
	var tmp1: Double = Math.sqrt(2*Math.PI/n);
	var tmp2: Double = n+1.0/(12*n-1.0/(10*n));
	tmp2 = Math.pow(tmp2/Math.E, n);
	return tmp1*tmp2*/
//}

fun ff (n:Int):Int{
	if (n==0) return 1;
	return n*ff(n-1)
}
/*public static int factorial(int n)
    {
        if (n == 0) return 1;
        return n * factorial(n-1);
    }*/