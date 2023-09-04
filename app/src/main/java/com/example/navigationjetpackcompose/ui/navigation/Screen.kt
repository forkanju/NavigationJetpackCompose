package com.example.navigationjetpackcompose.ui.navigation


const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

const val AUTH_ROUTE = "authentication"
const val ROOT_ROUTE = "root"
const val HOME_ROUTE = "home"

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    //FOR OPTIONAL SINGLE ARGUMENT
    /**   object Detail : Screen(route = "detail_screen?id={id}"){
    fun passId(id: Int = 0): String{
    return "detail_screen?id=$id"
    }*/
    //FOR OPTIONAL MULTIPLE ARGUMENT
    object Detail : Screen(route = "detail_screen?id={id}&name={name}") {
        fun passNameAndId(
            id: Int = 0,
            name: String = "Default Value"
        ): String {
            return "detail_screen?id=$id&name=$name"
        }


        //FOR SINGLE ARGUMENT - REQUIRED ARGUMENT
        /** object Detail : Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY}"){*/
        //FOR MULTIPLE ARGUMENTS - REQUIRED ARGUMENT
        /** object Detail : Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY2}"){*/
        //FOR SINGLE ARGUMENT
        /**        fun passId(id: Int): String{
        return this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id.toString())
        }*/

        //FOR MULTIPLE ARGUMENTS
        /**        fun passNameAndId(id: Int, name: String): String {
        return "detail_screen/$id/$name"
        }*/
    }

    object Login : Screen(route = "login_screen")
    object SignUp : Screen(route = "signup_screen")


}
