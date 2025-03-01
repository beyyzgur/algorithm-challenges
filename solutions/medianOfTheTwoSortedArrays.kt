class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {

        var ar = (nums1 + nums2).sortedArray().map {it.toDouble()}

        if( ar.size % 2 !== 0 ) {
            if ( ar.size == 1 ) return ar[0]
            else {
                return ar[ ar.size / 2 ]
            }
        }
        else return ((ar[ ar.size/2 - 1 ] + ar[ ar.size/2 ]) / 2 )

    }
}