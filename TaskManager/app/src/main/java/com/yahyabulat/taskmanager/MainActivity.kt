package com.yahyabulat.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yahyabulat.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                TaskCompleteDisplay(
                    imagePainter = painterResource(R.drawable.ic_task_completed),
                    info = stringResource(R.string.all_tasks_complete_text),
                    message = stringResource(R.string.display_message)
                )
            }
        }
    }
}

@Composable
fun TaskCompleteDisplay(imagePainter: Painter, info: String, message: String, modifier: Modifier = Modifier) {

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = imagePainter,
            contentDescription = null
        )

        Text(
            text = info,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
        )

        Text(
            text = message,
            fontSize = 16.sp,
            modifier = Modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TaskManagerPreview() {
    TaskCompleteDisplay(
        imagePainter = painterResource(R.drawable.ic_task_completed),
        info = stringResource(R.string.all_tasks_complete_text),
        message = stringResource(R.string.display_message)
    )
}