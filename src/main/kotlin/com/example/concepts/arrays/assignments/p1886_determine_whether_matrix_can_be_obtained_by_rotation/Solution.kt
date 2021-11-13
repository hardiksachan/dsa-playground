package com.example.concepts.arrays.assignments.p1886_determine_whether_matrix_can_be_obtained_by_rotation

// Find a better solution
// NOTE TO SELF: Take a look at the fact that matrix only contains 0 and 1
class Solution {
    fun findRotation(
        mat: Array<IntArray>,
        target: Array<IntArray>
    ): Boolean {
        var rot0 = true
        var rot90 = true
        var rot180 = true
        var rot270 = true

        // 90 degree rot => transpose and reverse row

        (mat.indices).forEach { i ->
            (mat.indices).forEach { j ->
                rot0 = rot0 && (mat[i][j] == target[i][j])
                rot90 = rot90 && (mat[i][j] == target[j][mat.lastIndex - i])
                rot180 = rot180 && (mat[i][j] == target[mat.lastIndex - i][mat.lastIndex - j])
                rot270 = rot270 && (mat[i][j] == target[mat.lastIndex - j][i])
            }
        }

        return rot0 || rot90 || rot180 || rot270
    }
}