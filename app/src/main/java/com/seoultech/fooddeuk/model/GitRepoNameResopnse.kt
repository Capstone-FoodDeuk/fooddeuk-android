package com.seoultech.fooddeuk.model

import com.google.gson.annotations.SerializedName

data class GitRepoNameResopnse(
    @SerializedName("name")
    var repoName: String
)
