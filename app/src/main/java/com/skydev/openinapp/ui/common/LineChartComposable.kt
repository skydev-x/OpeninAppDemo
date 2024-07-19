package com.skydev.openinapp.ui.common

import android.graphics.Color
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.formatter.ValueFormatter
import com.skydev.openinapp.R


@Composable
fun LineChartComposable(
    data: List<Pair<Float, Float>>,
    modifier: Modifier = Modifier
) {
    val ctx = LocalContext.current
    AndroidView(
        modifier = modifier,
        factory = { context ->
            LineChart(context).apply {
                val textColor = Color.parseColor("#FF999CA0")
                description.isEnabled = false
                setTouchEnabled(true)
                isDragEnabled = true
                setScaleEnabled(true)
                setPinchZoom(true)
                xAxis.position = XAxis.XAxisPosition.BOTTOM
                xAxis.granularity = 1f
                xAxis.valueFormatter = object : ValueFormatter() {
                    private val months = arrayOf(
                        "Jan",
                        "Feb",
                        "Mar",
                        "Apr",
                        "May",
                        "Jun",
                        "Jul",
                        "Aug",
                        "Sep",
                        "Oct",
                        "Nov",
                        "Dec"
                    )

                    override fun getFormattedValue(value: Float): String {
                        return months[value.toInt() % 12]
                    }
                }
                xAxis.textColor = textColor
                axisLeft.textColor = textColor
                axisLeft.axisMinimum = 0f
                axisLeft.axisMaximum = 100f
                axisLeft.granularity = 25f
                axisLeft.setDrawGridLines(true)
                axisRight.isEnabled = false
                legend.isEnabled = false
                legend.verticalAlignment = Legend.LegendVerticalAlignment.BOTTOM
                legend.horizontalAlignment = Legend.LegendHorizontalAlignment.LEFT
                legend.orientation = Legend.LegendOrientation.HORIZONTAL
                legend.setDrawInside(false)
            }
        },
        update = { chart ->
            val entries = data.map { Entry(it.first, it.second) }
            val primaryColor = Color.parseColor("#FF0E6FFF")
            val dataSet = LineDataSet(entries, "").apply {
                color = primaryColor
                setDrawCircles(false)
                setDrawValues(false)
                setDrawCircleHole(false)
                setDrawFilled(true)
                lineWidth = 2f
                valueTextSize = 10f
                val drawable = ContextCompat.getDrawable(ctx, R.drawable.primary_gradient)
                fillDrawable = drawable
            }
            chart.data = LineData(dataSet)
            chart.invalidate()
        }
    )
}