package com.mad.meetingsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mad.meetingsapp.ui.theme.MeetingsAppTheme

/*
(1) Clone and run this code.
(2) Create a Meeting data class that stores a name, a start hour, and an end hour,
(3) Create a Meetings class that stores a private list of Meeting objects.  This class has no getters or setters.
(4) Write the sorted Meetings data to a Text composable with each Meeting displayed in tabular format.
(5) If any Meeting objects have the same name, prompt the user to change the name.
(6) Given an hour, write A Text composable with the meeting names that include that hours.
(7) What are the next meeting(s)?  Include ongoing meetings and any meetings in the next hour.
(8) Merge the meetings and display the merge meetings in a Text composable in tabular format.
    For example, [["UC", 2, 3], ["Restaurant", 4, 5], ["Home", 1, 2]] merged is
    [["UC Home", 1, 3], ["Restaurant", 4, 5]]
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                Text("Hello, Meetings App!", style = MaterialTheme.typography.headlineLarge)
            }
        }
    }
}

