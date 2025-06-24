package com.example.myapplication

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.glance.*
import androidx.glance.action.actionStartActivity
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.layout.*
import androidx.glance.text.Text
import androidx.glance.text.TextStyle
import androidx.glance.text.FontWeight
import androidx.glance.unit.ColorProvider

class CyberpunkWidget : GlanceAppWidget() {

    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            CyberpunkUI()
        }
    }

    @Composable
    fun CyberpunkUI() {
        Column(
            modifier = GlanceModifier
                .fillMaxSize()
                .background(ColorProvider(Color.Black))
                .padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalAlignment = Alignment.Top
        ) {
            Text(
                text = "⚠️ SYSTEM STATUS",
                style = TextStyle(
                    color = ColorProvider(Color.Red),
                    fontWeight = FontWeight.Bold
                ),
                modifier = GlanceModifier.padding(bottom = 8.dp)
            )

            Button(
                text = "📝 TASKS",
                onClick = actionStartActivity<MainActivity>(),
                modifier = GlanceModifier
                    .defaultWeight()
                    .padding(bottom = 6.dp)
            )

            Button(
                text = "📂 FILES",
                onClick = actionStartActivity<WorkActivity>(),
                modifier = GlanceModifier
                    .defaultWeight()
                    .padding(bottom = 6.dp)
            )

            Text(
                text = "🌡️ TEMP: 44°C",
                style = TextStyle(color = ColorProvider(Color.Yellow)),
                modifier = GlanceModifier.padding(top = 10.dp)
            )
        }
    }
}
