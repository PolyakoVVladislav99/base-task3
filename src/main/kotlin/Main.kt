fun main() {
    println("Введите натуральное число:")
    val input = readLine()?.toIntOrNull()

    if (input == null || input <= 0) {
        println("Некорректный ввод! Введите натуральное число.")
        return
    }

    // Преобразование числа в двоичную систему
    val binary = Integer.toBinaryString(input)

    println("Двоичное представление: $binary")
}
