fun main() {
    hof("message") { message: String -> message.uppercase() }

    val text = "Идейные соображения высшего порядка, а также реализация намеченных плановых заданий способствует" +
            "подготовки и реализации позиций, занимаемых участниками в отношении поставленных задач." +
            " Задача организации, в особенности же укрепление и развитие структуры представляет собой интересный" +
            " эксперимент проверки существенных финансовых и административных условий.\n" +
            "\n" +
            "Разнообразный и богатый опыт сложившаяся структура организации требуют от нас анализа соответствующий" +
            " условий активизации. Повседневная практика показывает, что рамки и место обучения кадров способствует" +
            " подготовки и реализации существенных финансовых и административных условий. Задача организации," +
            " в особенности же постоянный количественный рост и сфера нашей активности требуют определения и " +
            "уточнения форм развития."
    hof(text) { message: String -> message.replace(",", "блин") }
}

fun hof(message: String, convert: (String) -> String): String {
    val res = convert(message)
    println(res)
    return res
}