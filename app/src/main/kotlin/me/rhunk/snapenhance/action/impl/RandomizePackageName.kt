package me.rhunk.snapenhance.action.impl

import android.app.ProgressDialog
import android.content.Context
import me.rhunk.snapenhance.Logger
import me.rhunk.snapenhance.SharedContext
import me.rhunk.snapenhance.bridge.TranslationWrapper
import kotlin.random.Random


class RandomizePackageName {
    lateinit var translation: TranslationWrapper
    
    private fun randomPackageName(): String {
        val chars = "abcdefghijklmnopqrstuvwxyz"
        val random = Random.Default
    
        return List(3) { _ ->
            List(5) { chars.random(random) }.joinToString("")
        }.joinToString(".")
    }
    
    @Suppress("DEPRECATION")
    fun run(actionContext: Context) {
        val packageName = randomPackageName()
        val progressDialog = ProgressDialog(actionContext)
        progressDialog.setCancelable(true)
        progressDialog.setTitle("Randomize Package Name")
        progressDialog.setMessage("jklnmaosdphjawpm")
        progressDialog.setOnCancelListener() {
            progressDialog.dismiss()
            return@setOnCancelListener
        }
        progressDialog.show()
    }
}