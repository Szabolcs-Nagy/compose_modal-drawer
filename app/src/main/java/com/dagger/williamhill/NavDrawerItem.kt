package com.dagger.williamhill

sealed class NavDrawerItem(var route: String, var icon: Int, var title: String) {
    object Home : NavDrawerItem("home", R.drawable.ic_launcher_background, "Home")
    object WhatsOn : NavDrawerItem("whatson", R.drawable.ic_launcher_background, "WhatsOn")
    object Music : NavDrawerItem("music", R.drawable.ic_launcher_background, "Music")
    object Movies : NavDrawerItem("movies", R.drawable.ic_launcher_background, "Movies")
    object Books : NavDrawerItem("books", R.drawable.ic_launcher_background, "Books")
    object Profile : NavDrawerItem("profile", R.drawable.ic_launcher_background, "Profile")
    object Settings : NavDrawerItem("settings", R.drawable.ic_launcher_background, "Settings")
}