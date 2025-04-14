package dev.shadoe.testapp

import android.service.quicksettings.TileService

class TestTile : TileService() {
    override fun onCreate() {
        super.onCreate()
        println("tile created")
    }

    override fun onTileAdded() {
        super.onTileAdded()
        println("tile added")
    }

    override fun onStartListening() {
        super.onStartListening()
        println("tile start listening")
    }

    override fun onClick() {
        super.onClick()
        println("tile clicked")
    }

    override fun onStopListening() {
        println("tile stop listening")
        super.onStopListening()
    }

    override fun onTileRemoved() {
        println("tile removed")
        super.onTileRemoved()
    }

    override fun onDestroy() {
        println("tile destroyed")
        super.onDestroy()
    }
}