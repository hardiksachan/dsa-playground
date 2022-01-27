package com.example.randomproblems.hrml

data class Tag(
    val name: String,
    val tags: MutableList<Tag>,
    val attr: MutableList<Attribute>,
)

data class Attribute(
    val name: String,
    val value: String,
)

fun main() {
    val results = mutableListOf<String>()

    val base = Tag(
        name = "base",
        tags = mutableListOf(),
        attr = mutableListOf(),
    )

    val (n, r) = readLine()!!.split(" ").map { it.toInt() }.let { it[0] to it[1] }

    var tags = mutableListOf(base)

    for (i in 0 until n) {
        val raw = readLine()!!
        if (raw[1] != '/') {
            val tag = parseTagline(raw)
            tags.last().tags.add(tag)
            tags.add(tag)
        } else {
            tags.removeAt(tags.lastIndex)
        }
    }

    for (q in 0 until r) {
        try {
            val (path, attrName) = readLine()!!.split("~").let { it[0] to it[1] }

            var curr = base

            path.split(".").forEach { k ->
                curr = curr.tags.first { it.name == k }
            }

            results.add(curr.attr.first { it.name == attrName }.value)
        } catch (e: Exception) {
            results.add("NotFound")
        }
    }
}

fun parseTagline(raw: String): Tag {
    val line = raw.drop(1).dropLast(1).split(" ")

    val base = Tag(
        name = line[0],
        tags = mutableListOf(),
        attr = mutableListOf(),
    )

    val attrs = line.drop(1)
    var i = 0
    while (i < attrs.size) {
        val attr = Attribute(
            name = attrs[i],
            value = attrs[i + 2].drop(1).dropLast(1)
        )
        i += 3;
        base.attr.add(attr)
    }

    return base
}