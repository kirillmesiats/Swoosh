package eu.relsys.swoosh.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import eu.relsys.swoosh.R
import eu.relsys.swoosh.Utilities.EXTRA_PLAYER
import eu.relsys.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
