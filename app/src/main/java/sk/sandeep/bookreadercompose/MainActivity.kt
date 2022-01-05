package sk.sandeep.bookreadercompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import dagger.hilt.android.AndroidEntryPoint
import sk.sandeep.bookreadercompose.navigation.ReaderNavigation
import sk.sandeep.bookreadercompose.ui.theme.BookReaderComposeTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookReaderComposeTheme {
                ReaderApp()
            }
        }
    }
}

@Composable
fun ReaderApp() {
    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ReaderNavigation()
        }
    }
}

/*
for firebaseDatastore demo

  val db = FirebaseFirestore.getInstance()
                val user: MutableMap<String, Any> = HashMap()

                user["firstName"] = "Sandeep"
                user["lastName"] = "Kumar"

db.collection("users").add(user).addOnSuccessListener {
                        Log.d("FB", "onCreateSuccess: ${it.id}")
                    }.addOnFailureListener {
                        Log.d("FB", "onCreateFailure: $it")
                    }
* */