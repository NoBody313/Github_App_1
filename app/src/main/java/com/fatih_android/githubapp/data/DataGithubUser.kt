package com.fatih_android.githubapp.data

import com.fatih_android.githubapp.R

object DataGithubUser {
    private val usernameGihtubUser = arrayOf(
        "JakeWharton",
        "amitshekhariitbhu",
        "romainguy",
        "chrisbanes",
        "tipsy",
        "ravi8x",
        "jasoet",
        "budioktaviyan",
        "hendisantika",
        "sidiqpermana"
    )

    private val nameGithubUser = arrayOf(
        "Jake Wharton",
        "Amit Shekhar",
        "Romain Guy",
        "Chris Banes",
        "David",
        "Ravi Tamada",
        "Deny Prasetyo",
        "Budi Oktaviyan",
        "Hendi Santika",
        "Sidiq Permana"
    )

    private val locationGithubUser = arrayOf(
        "Pittsburgh, PA, USA",
        "New Delhi, India",
        "California",
        "Sydney, Australia",
        "Trondheim, Norway",
        "India",
        "Kotagede, Yogyakarta, Indonesia",
        "Jakarta, Indonesia",
        "Bojongsoang - Bandung Jawa Barat",
        "Jakarta Indonesia"
    )

    private val repositoryGithubUser = arrayOf(
        "102",
        "37",
        "9",
        "30",
        "56",
        "28",
        "44",
        "110",
        "1064",
        "65"
    )

    private val companyGithubUser = arrayOf(
        "Google, Inc.",
        "MindOrksOpenSource",
        "Google",
        "Google working on @android",
        "Working Group Two",
        "AndroidHive | Droid5",
        "gojek-engineering",
        "KotlinID",
        "JVMDeveloperID @KotlinID @IDDevOp",
        "Nusantara Beta Studio"
    )

    private val followersGithubUser = arrayOf(
        "56995",
        "5153",
        "7972",
        "14725",
        "788",
        "18628",
        "277",
        "178",
        "428",
        "465"
    )

    private val followingGithubUser = arrayOf(
        "12",
        "2",
        "0",
        "1",
        "0",
        "3",
        "39",
        "23",
        "61",
        "10"
    )

    private val avatarGithubUser = arrayOf(
        R.drawable.user1,
        R.drawable.user2,
        R.drawable.user3,
        R.drawable.user4,
        R.drawable.user5,
        R.drawable.user6,
        R.drawable.user7,
        R.drawable.user8,
        R.drawable.user9,
        R.drawable.user10
    )

    val listDataGithubUser: ArrayList<GithubUser>
        get() {
            val listDataGithubUser = arrayListOf<GithubUser>()
            for (position in usernameGihtubUser.indices) {
                val githubUser = GithubUser(
                    username = usernameGihtubUser[position],
                    name = nameGithubUser[position],
                    location = locationGithubUser[position],
                    repository = repositoryGithubUser[position],
                    company = companyGithubUser[position],
                    followers = followersGithubUser[position],
                    following = followingGithubUser[position],
                    avatar = avatarGithubUser[position]
                )
                listDataGithubUser.add(githubUser)
            }
            return listDataGithubUser
        }
}