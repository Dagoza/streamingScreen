package info.dvkr.screenstream.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import info.dvkr.screenstream.R
import kotlinx.android.synthetic.main.activity_about.*


class AboutActivity : AppCompatActivity() {

    companion object {
        fun getStartIntent(context: Context): Intent = Intent(context, AboutActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val version = applicationContext.packageManager.getPackageInfo(packageName, 0).versionName
        textViewAboutVersion.text = getString(R.string.about_app_version).format(version)

    }
}