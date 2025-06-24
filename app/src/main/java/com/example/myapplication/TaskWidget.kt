package com.example.myapplication

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.glance.*
import androidx.glance.action.actionStartActivity
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.layout.*
import androidx.glance.text.Text
import androidx.glance.text.TextStyle
import androidx.glance.text.FontWeight

class TaskWidget : GlanceAppWidget() {

    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            GlanceTheme {
                TaskContent()
            }
        }
    }

    @Composable
    fun TaskContent() {
        Column(
            modifier = GlanceModifier.fillMaxSize().padding(16.dp),
            verticalAlignment = Alignment.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "📌 Última tarea:",
                style = TextStyle(fontWeight = FontWeight.Bold),
                modifier = GlanceModifier.padding(bottom = 8.dp)
            )
            Text(
                text = "Terminar informe del Lab 14",
                modifier = GlanceModifier.padding(bottom = 12.dp)
            )
            Button(
                text = "Agregar nueva tarea",
                onClick = actionStartActivity<MainActivity>()
            )
        }
    }
}
