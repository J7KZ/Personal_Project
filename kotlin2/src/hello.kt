fun main(args: Array<String>) {
	hello() // ����� ������� hello
   
}
// ����������� ������� hello
fun hello(){
    for(i in 1..9){
    for(j in 1..9){
        print("${i * j} \t")
    }
    println()
}}
