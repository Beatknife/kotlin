package com.yahyabulat.a30daykotlin.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.yahyabulat.a30daykotlin.R

data class Project(
    @StringRes val titleResourceId: Int,
    @StringRes val daysResourceId: Int,
    @StringRes val difficultyResourceId: Int,
    @StringRes val descriptionResourceId: Int,
    @DrawableRes val imageResourceId: Int,
)

val projects = listOf(
    Project(R.string.project1, R.string.days1, R.string.difficulty_easy, R.string.description1, R.drawable.project1),
    Project(R.string.project2, R.string.days2, R.string.difficulty_easy, R.string.description2, R.drawable.project2),
    Project(R.string.project3, R.string.days3, R.string.difficulty_easy, R.string.description3, R.drawable.project3),
    Project(R.string.project4, R.string.days4, R.string.difficulty_easy, R.string.description4, R.drawable.project4),
    Project(R.string.project5, R.string.days5, R.string.difficulty_easy, R.string.description5, R.drawable.project5),
    Project(R.string.project6, R.string.days6, R.string.difficulty_medium, R.string.description6, R.drawable.project6),
    Project(R.string.project7, R.string.days7, R.string.difficulty_medium, R.string.description7, R.drawable.project7),
    Project(R.string.project8, R.string.days8, R.string.difficulty_medium, R.string.description8, R.drawable.project8),
    Project(R.string.project9, R.string.days9, R.string.difficulty_medium, R.string.description9, R.drawable.project9),
    Project(R.string.project10, R.string.days10, R.string.difficulty_easy, R.string.description10, R.drawable.project10),
    Project(R.string.project11, R.string.days11, R.string.difficulty_medium, R.string.description11, R.drawable.project11),
    Project(R.string.project12, R.string.days12, R.string.difficulty_medium, R.string.description12, R.drawable.project12),
    Project(R.string.project13, R.string.days13, R.string.difficulty_easy, R.string.description13, R.drawable.project13),
    Project(R.string.project14, R.string.days14, R.string.difficulty_medium, R.string.description14, R.drawable.project14),
    Project(R.string.project15, R.string.days15, R.string.difficulty_medium, R.string.description15, R.drawable.project15),
    Project(R.string.project16, R.string.days16, R.string.difficulty_medium, R.string.description16, R.drawable.project16),
    Project(R.string.project17, R.string.days17, R.string.difficulty_medium, R.string.description17, R.drawable.project17),
    Project(R.string.project18, R.string.days18, R.string.difficulty_medium, R.string.description18, R.drawable.project18),
    Project(R.string.project19, R.string.days19, R.string.difficulty_easy, R.string.description19, R.drawable.project19),
    Project(R.string.project20, R.string.days20, R.string.difficulty_easy, R.string.description20, R.drawable.project20),
    Project(R.string.project21, R.string.days21, R.string.difficulty_medium, R.string.description21, R.drawable.project21),
    Project(R.string.project22, R.string.days22, R.string.difficulty_medium, R.string.description22, R.drawable.project22),
    Project(R.string.project23, R.string.days23, R.string.difficulty_medium, R.string.description23, R.drawable.project23),
    Project(R.string.project24, R.string.days24, R.string.difficulty_easy, R.string.description24, R.drawable.project24),
    Project(R.string.project25, R.string.days25, R.string.difficulty_medium, R.string.description25, R.drawable.project25),
    Project(R.string.project26, R.string.days26, R.string.difficulty_hard, R.string.description26, R.drawable.project26),
    Project(R.string.project27, R.string.days27, R.string.difficulty_medium, R.string.description27, R.drawable.project27),
    Project(R.string.project28, R.string.days28, R.string.difficulty_medium, R.string.description28, R.drawable.project28),
    Project(R.string.project29, R.string.days29, R.string.difficulty_medium, R.string.description29, R.drawable.project29),
    Project(R.string.project30, R.string.days30, R.string.difficulty_hard, R.string.description30, R.drawable.project30),
)
