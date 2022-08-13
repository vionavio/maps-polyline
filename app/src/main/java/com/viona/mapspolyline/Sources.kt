package com.viona.mapspolyline

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object Sources {
   val json = """
       {
           "status": true,
           "message": "success",
           "data": {
               "route": [
                   {
                       "latitude": -7.65161,
                       "longitude": 110.30014
                   },
                   {
                       "latitude": -7.65148,
                       "longitude": 110.30042
                   },
                   {
                       "latitude": -7.65133,
                       "longitude": 110.30057
                   },
                   {
                       "latitude": -7.65119,
                       "longitude": 110.30066
                   },
                   {
                       "latitude": -7.65109,
                       "longitude": 110.30105
                   },
                   {
                       "latitude": -7.65091,
                       "longitude": 110.3013
                   },
                   {
                       "latitude": -7.65078,
                       "longitude": 110.30138
                   },
                   {
                       "latitude": -7.65064,
                       "longitude": 110.30151
                   },
                   {
                       "latitude": -7.65054,
                       "longitude": 110.30165
                   },
                   {
                       "latitude": -7.65046,
                       "longitude": 110.30169
                   },
                   {
                       "latitude": -7.65029,
                       "longitude": 110.30191
                   },
                   {
                       "latitude": -7.65017,
                       "longitude": 110.30202
                   },
                   {
                       "latitude": -7.64996,
                       "longitude": 110.30221
                   },
                   {
                       "latitude": -7.64984,
                       "longitude": 110.30241
                   },
                   {
                       "latitude": -7.64965,
                       "longitude": 110.30259
                   },
                   {
                       "latitude": -7.64953,
                       "longitude": 110.30277
                   },
                   {
                       "latitude": -7.64958,
                       "longitude": 110.30294
                   },
                   {
                       "latitude": -7.64962,
                       "longitude": 110.30312
                   },
                   {
                       "latitude": -7.6496,
                       "longitude": 110.30329
                   },
                   {
                       "latitude": -7.6495,
                       "longitude": 110.30342
                   },
                   {
                       "latitude": -7.64933,
                       "longitude": 110.30365
                   },
                   {
                       "latitude": -7.64968,
                       "longitude": 110.30447
                   },
                   {
                       "latitude": -7.64995,
                       "longitude": 110.305
                   },
                   {
                       "latitude": -7.64999,
                       "longitude": 110.30508
                   },
                   {
                       "latitude": -7.65004,
                       "longitude": 110.30517
                   },
                   {
                       "latitude": -7.65022,
                       "longitude": 110.30558
                   },
                   {
                       "latitude": -7.65043,
                       "longitude": 110.30589
                   },
                   {
                       "latitude": -7.65145,
                       "longitude": 110.30723
                   },
                   {
                       "latitude": -7.65116,
                       "longitude": 110.30765
                   },
                   {
                       "latitude": -7.65103,
                       "longitude": 110.30779
                   },
                   {
                       "latitude": -7.65067,
                       "longitude": 110.30835
                   },
                   {
                       "latitude": -7.65008,
                       "longitude": 110.30927
                   },
                   {
                       "latitude": -7.64913,
                       "longitude": 110.31092
                   },
                   {
                       "latitude": -7.64893,
                       "longitude": 110.31125
                   },
                   {
                       "latitude": -7.64782,
                       "longitude": 110.31328
                   },
                   {
                       "latitude": -7.6464,
                       "longitude": 110.31568
                   },
                   {
                       "latitude": -7.64625,
                       "longitude": 110.31589
                   },
                   {
                       "latitude": -7.64565,
                       "longitude": 110.31702
                   },
                   {
                       "latitude": -7.64444,
                       "longitude": 110.31892
                   },
                   {
                       "latitude": -7.6442,
                       "longitude": 110.31932
                   },
                   {
                       "latitude": -7.64382,
                       "longitude": 110.32008
                   },
                   {
                       "latitude": -7.64376,
                       "longitude": 110.3202
                   },
                   {
                       "latitude": -7.64355,
                       "longitude": 110.32058
                   },
                   {
                       "latitude": -7.64344,
                       "longitude": 110.32084
                   },
                   {
                       "latitude": -7.64303,
                       "longitude": 110.32155
                   },
                   {
                       "latitude": -7.64285,
                       "longitude": 110.32187
                   },
                   {
                       "latitude": -7.64275,
                       "longitude": 110.32205
                   },
                   {
                       "latitude": -7.64214,
                       "longitude": 110.32307
                   },
                   {
                       "latitude": -7.64173,
                       "longitude": 110.32293
                   },
                   {
                       "latitude": -7.64155,
                       "longitude": 110.32286
                   },
                   {
                       "latitude": -7.64117,
                       "longitude": 110.32271
                   },
                   {
                       "latitude": -7.641,
                       "longitude": 110.32263
                   },
                   {
                       "latitude": -7.64076,
                       "longitude": 110.32251
                   },
                   {
                       "latitude": -7.64048,
                       "longitude": 110.32238
                   },
                   {
                       "latitude": -7.64017,
                       "longitude": 110.32221
                   },
                   {
                       "latitude": -7.63995,
                       "longitude": 110.3221
                   },
                   {
                       "latitude": -7.63954,
                       "longitude": 110.3219
                   },
                   {
                       "latitude": -7.63927,
                       "longitude": 110.32177
                   },
                   {
                       "latitude": -7.63898,
                       "longitude": 110.32163
                   },
                   {
                       "latitude": -7.63876,
                       "longitude": 110.3215
                   },
                   {
                       "latitude": -7.6386,
                       "longitude": 110.32141
                   },
                   {
                       "latitude": -7.63841,
                       "longitude": 110.3213
                   },
                   {
                       "latitude": -7.63831,
                       "longitude": 110.32125
                   },
                   {
                       "latitude": -7.6379,
                       "longitude": 110.32105
                   },
                   {
                       "latitude": -7.63727,
                       "longitude": 110.32073
                   },
                   {
                       "latitude": -7.63676,
                       "longitude": 110.32048
                   },
                   {
                       "latitude": -7.6361,
                       "longitude": 110.32014
                   },
                   {
                       "latitude": -7.63491,
                       "longitude": 110.31957
                   },
                   {
                       "latitude": -7.63445,
                       "longitude": 110.31936
                   },
                   {
                       "latitude": -7.63428,
                       "longitude": 110.31929
                   },
                   {
                       "latitude": -7.63405,
                       "longitude": 110.31921
                   },
                   {
                       "latitude": -7.63392,
                       "longitude": 110.31918
                   },
                   {
                       "latitude": -7.63376,
                       "longitude": 110.31916
                   },
                   {
                       "latitude": -7.63357,
                       "longitude": 110.31919
                   },
                   {
                       "latitude": -7.63327,
                       "longitude": 110.31927
                   },
                   {
                       "latitude": -7.63305,
                       "longitude": 110.31933
                   },
                   {
                       "latitude": -7.63239,
                       "longitude": 110.31953
                   },
                   {
                       "latitude": -7.63224,
                       "longitude": 110.31957
                   },
                   {
                       "latitude": -7.63168,
                       "longitude": 110.31974
                   },
                   {
                       "latitude": -7.63109,
                       "longitude": 110.31991
                   },
                   {
                       "latitude": -7.63088,
                       "longitude": 110.31999
                   },
                   {
                       "latitude": -7.63062,
                       "longitude": 110.32011
                   },
                   {
                       "latitude": -7.63051,
                       "longitude": 110.3202
                   },
                   {
                       "latitude": -7.63029,
                       "longitude": 110.32041
                   },
                   {
                       "latitude": -7.62988,
                       "longitude": 110.32098
                   },
                   {
                       "latitude": -7.62976,
                       "longitude": 110.32113
                   },
                   {
                       "latitude": -7.62965,
                       "longitude": 110.32123
                   },
                   {
                       "latitude": -7.62951,
                       "longitude": 110.32133
                   },
                   {
                       "latitude": -7.62933,
                       "longitude": 110.32141
                   },
                   {
                       "latitude": -7.62921,
                       "longitude": 110.32146
                   },
                   {
                       "latitude": -7.62904,
                       "longitude": 110.3215
                   },
                   {
                       "latitude": -7.62887,
                       "longitude": 110.32152
                   },
                   {
                       "latitude": -7.62871,
                       "longitude": 110.32151
                   },
                   {
                       "latitude": -7.62853,
                       "longitude": 110.32147
                   },
                   {
                       "latitude": -7.62842,
                       "longitude": 110.32142
                   },
                   {
                       "latitude": -7.62823,
                       "longitude": 110.32133
                   },
                   {
                       "latitude": -7.62821,
                       "longitude": 110.32132
                   },
                   {
                       "latitude": -7.62806,
                       "longitude": 110.32121
                   },
                   {
                       "latitude": -7.62789,
                       "longitude": 110.32102
                   },
                   {
                       "latitude": -7.62782,
                       "longitude": 110.3209
                   },
                   {
                       "latitude": -7.62774,
                       "longitude": 110.32078
                   },
                   {
                       "latitude": -7.62759,
                       "longitude": 110.32056
                   },
                   {
                       "latitude": -7.62743,
                       "longitude": 110.32026
                   },
                   {
                       "latitude": -7.62734,
                       "longitude": 110.32002
                   },
                   {
                       "latitude": -7.62722,
                       "longitude": 110.31965
                   },
                   {
                       "latitude": -7.62688,
                       "longitude": 110.31848
                   },
                   {
                       "latitude": -7.62668,
                       "longitude": 110.3178
                   },
                   {
                       "latitude": -7.62614,
                       "longitude": 110.31594
                   },
                   {
                       "latitude": -7.62595,
                       "longitude": 110.31535
                   },
                   {
                       "latitude": -7.6259,
                       "longitude": 110.31521
                   },
                   {
                       "latitude": -7.62584,
                       "longitude": 110.3151
                   },
                   {
                       "latitude": -7.62575,
                       "longitude": 110.31499
                   },
                   {
                       "latitude": -7.62561,
                       "longitude": 110.31486
                   },
                   {
                       "latitude": -7.62512,
                       "longitude": 110.31451
                   },
                   {
                       "latitude": -7.6245,
                       "longitude": 110.31408
                   },
                   {
                       "latitude": -7.62421,
                       "longitude": 110.31388
                   },
                   {
                       "latitude": -7.62428,
                       "longitude": 110.31381
                   },
                   {
                       "latitude": -7.6244,
                       "longitude": 110.3137
                   },
                   {
                       "latitude": -7.62464,
                       "longitude": 110.3135
                   },
                   {
                       "latitude": -7.62499,
                       "longitude": 110.31322
                   },
                   {
                       "latitude": -7.62514,
                       "longitude": 110.3131
                   },
                   {
                       "latitude": -7.62518,
                       "longitude": 110.31306
                   },
                   {
                       "latitude": -7.62615,
                       "longitude": 110.31213
                   },
                   {
                       "latitude": -7.62625,
                       "longitude": 110.31203
                   },
                   {
                       "latitude": -7.62638,
                       "longitude": 110.31185
                   },
                   {
                       "latitude": -7.62815,
                       "longitude": 110.30952
                   },
                   {
                       "latitude": -7.62906,
                       "longitude": 110.30829
                   },
                   {
                       "latitude": -7.62943,
                       "longitude": 110.30782
                   },
                   {
                       "latitude": -7.63099,
                       "longitude": 110.30584
                   },
                   {
                       "latitude": -7.63126,
                       "longitude": 110.30548
                   },
                   {
                       "latitude": -7.6324,
                       "longitude": 110.30416
                   },
                   {
                       "latitude": -7.63268,
                       "longitude": 110.30386
                   },
                   {
                       "latitude": -7.6348,
                       "longitude": 110.30155
                   },
                   {
                       "latitude": -7.63508,
                       "longitude": 110.30125
                   },
                   {
                       "latitude": -7.63592,
                       "longitude": 110.30039
                   },
                   {
                       "latitude": -7.63743,
                       "longitude": 110.29889
                   },
                   {
                       "latitude": -7.63798,
                       "longitude": 110.29831
                   },
                   {
                       "latitude": -7.6401,
                       "longitude": 110.29567
                   },
                   {
                       "latitude": -7.64013,
                       "longitude": 110.29563
                   },
                   {
                       "latitude": -7.64023,
                       "longitude": 110.29555
                   },
                   {
                       "latitude": -7.64057,
                       "longitude": 110.29511
                   },
                   {
                       "latitude": -7.64059,
                       "longitude": 110.29509
                   },
                   {
                       "latitude": -7.6415,
                       "longitude": 110.29397
                   },
                   {
                       "latitude": -7.64212,
                       "longitude": 110.2932
                   },
                   {
                       "latitude": -7.64255,
                       "longitude": 110.29267
                   },
                   {
                       "latitude": -7.64267,
                       "longitude": 110.29253
                   },
                   {
                       "latitude": -7.6429,
                       "longitude": 110.29224
                   },
                   {
                       "latitude": -7.64317,
                       "longitude": 110.29191
                   },
                   {
                       "latitude": -7.64343,
                       "longitude": 110.29158
                   },
                   {
                       "latitude": -7.64349,
                       "longitude": 110.29151
                   },
                   {
                       "latitude": -7.64394,
                       "longitude": 110.29096
                   },
                   {
                       "latitude": -7.64426,
                       "longitude": 110.29068
                   },
                   {
                       "latitude": -7.64525,
                       "longitude": 110.28983
                   },
                   {
                       "latitude": -7.64651,
                       "longitude": 110.28883
                   },
                   {
                       "latitude": -7.64708,
                       "longitude": 110.28841
                   },
                   {
                       "latitude": -7.64771,
                       "longitude": 110.28796
                   },
                   {
                       "latitude": -7.64777,
                       "longitude": 110.28792
                   },
                   {
                       "latitude": -7.64812,
                       "longitude": 110.28768
                   },
                   {
                       "latitude": -7.64908,
                       "longitude": 110.28699
                   },
                   {
                       "latitude": -7.6497,
                       "longitude": 110.28655
                   },
                   {
                       "latitude": -7.64846,
                       "longitude": 110.28515
                   },
                   {
                       "latitude": -7.64812,
                       "longitude": 110.28461
                   },
                   {
                       "latitude": -7.64726,
                       "longitude": 110.28337
                   },
                   {
                       "latitude": -7.64709,
                       "longitude": 110.28307
                   },
                   {
                       "latitude": -7.64683,
                       "longitude": 110.28246
                   },
                   {
                       "latitude": -7.6466,
                       "longitude": 110.28222
                   },
                   {
                       "latitude": -7.64644,
                       "longitude": 110.28201
                   },
                   {
                       "latitude": -7.64634,
                       "longitude": 110.2819
                   },
                   {
                       "latitude": -7.64631,
                       "longitude": 110.28186
                   },
                   {
                       "latitude": -7.64614,
                       "longitude": 110.28173
                   },
                   {
                       "latitude": -7.64597,
                       "longitude": 110.28165
                   },
                   {
                       "latitude": -7.6457,
                       "longitude": 110.28153
                   },
                   {
                       "latitude": -7.64555,
                       "longitude": 110.28144
                   },
                   {
                       "latitude": -7.64526,
                       "longitude": 110.28123
                   },
                   {
                       "latitude": -7.64499,
                       "longitude": 110.28105
                   },
                   {
                       "latitude": -7.64492,
                       "longitude": 110.28099
                   },
                   {
                       "latitude": -7.6446,
                       "longitude": 110.28071
                   },
                   {
                       "latitude": -7.64446,
                       "longitude": 110.28052
                   },
                   {
                       "latitude": -7.64423,
                       "longitude": 110.28017
                   },
                   {
                       "latitude": -7.6441,
                       "longitude": 110.27997
                   },
                   {
                       "latitude": -7.64404,
                       "longitude": 110.27988
                   },
                   {
                       "latitude": -7.644,
                       "longitude": 110.27982
                   },
                   {
                       "latitude": -7.64363,
                       "longitude": 110.27957
                   },
                   {
                       "latitude": -7.6435,
                       "longitude": 110.2795
                   },
                   {
                       "latitude": -7.64334,
                       "longitude": 110.27941
                   },
                   {
                       "latitude": -7.64317,
                       "longitude": 110.27929
                   },
                   {
                       "latitude": -7.64314,
                       "longitude": 110.27926
                   },
                   {
                       "latitude": -7.643,
                       "longitude": 110.27907
                   },
                   {
                       "latitude": -7.64274,
                       "longitude": 110.27868
                   },
                   {
                       "latitude": -7.64246,
                       "longitude": 110.27815
                   },
                   {
                       "latitude": -7.64241,
                       "longitude": 110.27806
                   },
                   {
                       "latitude": -7.64215,
                       "longitude": 110.27763
                   },
                   {
                       "latitude": -7.64135,
                       "longitude": 110.27667
                   },
                   {
                       "latitude": -7.64108,
                       "longitude": 110.27635
                   },
                   {
                       "latitude": -7.641,
                       "longitude": 110.27625
                   },
                   {
                       "latitude": -7.64083,
                       "longitude": 110.27605
                   },
                   {
                       "latitude": -7.64035,
                       "longitude": 110.27576
                   },
                   {
                       "latitude": -7.64031,
                       "longitude": 110.27573
                   },
                   {
                       "latitude": -7.63975,
                       "longitude": 110.27532
                   },
                   {
                       "latitude": -7.63995,
                       "longitude": 110.27521
                   },
                   {
                       "latitude": -7.64028,
                       "longitude": 110.27508
                   },
                   {
                       "latitude": -7.6406,
                       "longitude": 110.27498
                   },
                   {
                       "latitude": -7.64112,
                       "longitude": 110.27475
                   },
                   {
                       "latitude": -7.64177,
                       "longitude": 110.27465
                   },
                   {
                       "latitude": -7.64195,
                       "longitude": 110.27456
                   },
                   {
                       "latitude": -7.64209,
                       "longitude": 110.27443
                   },
                   {
                       "latitude": -7.64223,
                       "longitude": 110.2744
                   },
                   {
                       "latitude": -7.64239,
                       "longitude": 110.27441
                   },
                   {
                       "latitude": -7.64256,
                       "longitude": 110.27436
                   },
                   {
                       "latitude": -7.64263,
                       "longitude": 110.27432
                   },
                   {
                       "latitude": -7.64289,
                       "longitude": 110.27416
                   },
                   {
                       "latitude": -7.64404,
                       "longitude": 110.27356
                   },
                   {
                       "latitude": -7.64451,
                       "longitude": 110.27333
                   },
                   {
                       "latitude": -7.64458,
                       "longitude": 110.27328
                   },
                   {
                       "latitude": -7.645,
                       "longitude": 110.27303
                   },
                   {
                       "latitude": -7.64558,
                       "longitude": 110.27263
                   },
                   {
                       "latitude": -7.64615,
                       "longitude": 110.27232
                   },
                   {
                       "latitude": -7.64701,
                       "longitude": 110.27176
                   },
                   {
                       "latitude": -7.64706,
                       "longitude": 110.27171
                   },
                   {
                       "latitude": -7.64708,
                       "longitude": 110.27163
                   },
                   {
                       "latitude": -7.64707,
                       "longitude": 110.27155
                   },
                   {
                       "latitude": -7.64696,
                       "longitude": 110.27134
                   },
                   {
                       "latitude": -7.64696,
                       "longitude": 110.27124
                   },
                   {
                       "latitude": -7.64698,
                       "longitude": 110.2712
                   },
                   {
                       "latitude": -7.64706,
                       "longitude": 110.27116
                   },
                   {
                       "latitude": -7.64715,
                       "longitude": 110.27112
                   },
                   {
                       "latitude": -7.64735,
                       "longitude": 110.271
                   },
                   {
                       "latitude": -7.64799,
                       "longitude": 110.27065
                   },
                   {
                       "latitude": -7.64813,
                       "longitude": 110.27063
                   },
                   {
                       "latitude": -7.64817,
                       "longitude": 110.27062
                   },
                   {
                       "latitude": -7.64829,
                       "longitude": 110.27088
                   },
                   {
                       "latitude": -7.64843,
                       "longitude": 110.27083
                   }
               ]
           }
       }
   """.trimIndent()

    fun getResultRoutes(): ResultRoutes {
        val gson = Gson()
        return gson.fromJson(json, object : TypeToken<ResultRoutes>() {}.type)
    }
}