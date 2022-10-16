package cn.open.book.ui.compose.util

import cn.open.book.ui.compose.data.HighLightWord


class DataUtils {
    companion object {
        fun getWordList(str: String): ArrayList<HighLightWord> {
            var wordList = ArrayList<HighLightWord>()
            var list = str.split(" ")
            for (word in list) {
                if (word.contains("\n")) {
                    wordList.add(HighLightWord(word.replace("\n", ""), "未备注"))
                    wordList.add(HighLightWord("\n", "", type = 1))
                } else {
                    wordList.add(HighLightWord(word, "未备注"))
                }

            }
            return wordList
        }
    }
}