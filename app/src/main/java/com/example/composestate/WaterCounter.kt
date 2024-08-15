package com.example.composestate

import android.annotation.SuppressLint
import androidx.collection.mutableIntSetOf
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composestate.ui.theme.ComposeStateTheme

@SuppressLint("UnrememberedMutableState")
@Composable
fun StatefulCounter(modifier:Modifier = Modifier){
   var count by rememberSaveable {mutableStateOf(0)}
   StatelessCounter(count =count, onIncrement ={count++}, modifier = modifier )
}

@Composable
private fun StatelessCounter(modifier: Modifier=Modifier, count: Int,onIncrement:() ->Unit) {
   Column(modifier = modifier.padding(16.dp)) {
      if (count > 0) {
         var showTask by rememberSaveable {
            mutableStateOf(true)
         }
         if(showTask)
         Text(text = "You've has $count glasses. ", modifier.padding(top = 36.dp))
      }
      Button(onClick = onIncrement , Modifier.padding(top = 8.dp), enabled = count < 10) {
         Text("Add one")
      }
   }
}

@Preview(showBackground = true)
@Composable
fun WaterCounterPreview(){
   ComposeStateTheme {
      StatefulCounter()
   }
}

