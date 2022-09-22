package com.example.calculator

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

var firstNumber: String = ""
var secondNumber: String = ""

var operator: Char? = null
var dot = 0
var result : Float? = null

var context: Context? = null

@Composable
fun Calculator() {
//    val SCREEN_HEIGHT = LocalConfiguration.current.screenHeightDp.dp
    val SCREEN_WIDTH = LocalConfiguration.current.screenWidthDp.dp

    context = LocalContext.current

    Card(
        elevation = 1.dp,
        backgroundColor = Color.Magenta,
        modifier = Modifier.fillMaxSize()
    ) {

        var expression by remember { mutableStateOf("") }

        Card() {
            Column(
                modifier = Modifier
                    .padding(0.dp, 320.dp, 0.dp, 0.dp)
                    .background(Color(0, 4, 50))
            ) {

                // Button AC,  +/-, %, /
                Row(
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Button(
                        onClick = {
                            operator = null
                            firstNumber = ""
                            secondNumber = ""
                            dot = 0
                            expression = ""
                        }, modifier = Modifier
                            .size(SCREEN_WIDTH / 4), colors = ButtonDefaults.textButtonColors(
                            backgroundColor = Color(0, 4, 50),
                            contentColor = Color.White
                        )


                    ) {
                        Text(text = "AC", fontSize = 40.sp, fontWeight = FontWeight.ExtraBold)
                    }

                    Button(
                        onClick = {
                            if(operator == null){
                                firstNumber = "-$firstNumber"
                                expression = "-$expression"
                            }else{
                                secondNumber = "-$secondNumber"
                                expression = "$firstNumber $operator-$secondNumber"
                            }

                        }, modifier = Modifier
                            .size(SCREEN_WIDTH / 4), colors = ButtonDefaults.textButtonColors(
                            backgroundColor = Color(0, 4, 50),
                            contentColor = Color.White
                        )


                    ) {
                        Text(text = "+/-", fontSize = 40.sp, fontWeight = FontWeight.ExtraBold)
                    }

                    Button(
                        onClick = {
                            operator = '%'
                            expression = "$firstNumber % "
                        }, modifier = Modifier
                            .size(SCREEN_WIDTH / 4), colors = ButtonDefaults.textButtonColors(
                            backgroundColor = Color(0, 4, 50),
                            contentColor = Color.White
                        )


                    ) {
                        Text(text = "%", fontSize = 40.sp, fontWeight = FontWeight.ExtraBold)
                    }

                    Button(
                        onClick = {
                            operator = '/'
                            dot = 0
                            expression = "$firstNumber / "
                        }, modifier = Modifier
                            .size(SCREEN_WIDTH / 4), colors = ButtonDefaults.textButtonColors(
                            backgroundColor = Color(0, 4, 90),
                            contentColor = Color(164, 92, 18)
                        )


                    ) {
                        Text(text = "/", fontSize = 40.sp, fontWeight = FontWeight.ExtraBold)
                    }


                }

                // Button 7, 8, 9, x
                Row(
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Button(
                        onClick = {
                            expression += 7.toString()
                            if(operator == null){
                                firstNumber += "7"
                            }else{
                                secondNumber += "7"
                            }
                        }, modifier = Modifier
                            .size(SCREEN_WIDTH / 4), colors = ButtonDefaults.textButtonColors(
                            backgroundColor = Color(0, 4, 50),
                            contentColor = Color.White
                        )


                    ) {
                        Text(text = "7", fontSize = 40.sp, fontWeight = FontWeight.ExtraBold)
                    }

                    Button(
                        onClick = {
                            expression += 8.toString()
                            if(operator == null){
                                firstNumber += "8"
                            }else{
                                secondNumber += "8"
                            }
                        }, modifier = Modifier
                            .size(SCREEN_WIDTH / 4), colors = ButtonDefaults.textButtonColors(
                            backgroundColor = Color(0, 4, 50),
                            contentColor = Color.White
                        )


                    ) {
                        Text(text = "8", fontSize = 40.sp, fontWeight = FontWeight.ExtraBold)
                    }

                    Button(
                        onClick = {
                            expression += 9.toString()
                            if(operator == null){
                                firstNumber += "9"
                            }else{
                                secondNumber += "9"
                            }
                        }, modifier = Modifier
                            .size(SCREEN_WIDTH / 4), colors = ButtonDefaults.textButtonColors(
                            backgroundColor = Color(0, 4, 50),
                            contentColor = Color.White
                        )


                    ) {
                        Text(text = "9", fontSize = 40.sp, fontWeight = FontWeight.ExtraBold)
                    }

                    Button(
                        onClick = {
                            operator = 'x'
                            dot = 0
                            expression = "$firstNumber x "
                        }, modifier = Modifier
                            .size(SCREEN_WIDTH / 4), colors = ButtonDefaults.textButtonColors(
                            backgroundColor = Color(0, 4, 90),
                            contentColor = Color(164, 92, 18)
                        )


                    ) {
                        Text(text = "x", fontSize = 40.sp, fontWeight = FontWeight.ExtraBold)
                    }


                }

                // Button 4, 5, 6, -
                Row(
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Button(
                        onClick = {
                            expression += 4.toString()
                            if(operator == null){
                                firstNumber += "4"
                            }else{
                                secondNumber += "4"
                            }
                        }, modifier = Modifier
                            .size(SCREEN_WIDTH / 4), colors = ButtonDefaults.textButtonColors(
                            backgroundColor = Color(0, 4, 50),
                            contentColor = Color.White
                        )


                    ) {
                        Text(text = "4", fontSize = 40.sp, fontWeight = FontWeight.ExtraBold)
                    }

                    Button(
                        onClick = {
                            expression += 5.toString()
                            if(operator == null){
                                firstNumber += "5"
                            }else{
                                secondNumber += "5"
                            }
                        }, modifier = Modifier
                            .size(SCREEN_WIDTH / 4), colors = ButtonDefaults.textButtonColors(
                            backgroundColor = Color(0, 4, 50),
                            contentColor = Color.White
                        )

                    ) {
                        Text(text = "5", fontSize = 40.sp, fontWeight = FontWeight.ExtraBold)
                    }

                    Button(
                        onClick = {
                            expression += 6.toString()
                            if(operator == null){
                                firstNumber += "6"
                            }else{
                                secondNumber += "6"
                            }
                        }, modifier = Modifier
                            .size(SCREEN_WIDTH / 4), colors = ButtonDefaults.textButtonColors(
                            backgroundColor = Color(0, 4, 50),
                            contentColor = Color.White
                        )


                    ) {
                        Text(text = "6", fontSize = 40.sp, fontWeight = FontWeight.ExtraBold)
                    }

                    Button(
                        onClick = {
                            operator = '-'
                            dot = 0
                            expression = "$firstNumber - "
                        }, modifier = Modifier
                            .size(SCREEN_WIDTH / 4), colors = ButtonDefaults.textButtonColors(
                            backgroundColor = Color(0, 4, 90),
                            contentColor = Color(164, 92, 18)
                        )


                    ) {
                        Text(text = "-", fontSize = 40.sp, fontWeight = FontWeight.ExtraBold)
                    }


                }

                // Button 1, 2, 3, +
                Row(
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Button(
                        onClick = {
                            expression += 1.toString()
                            if(operator == null){
                                firstNumber += "1"
                            }else{
                                secondNumber += "1"
                            }
                        }, modifier = Modifier
                            .size(SCREEN_WIDTH / 4), colors = ButtonDefaults.textButtonColors(
                            backgroundColor = Color(0, 4, 50),
                            contentColor = Color.White
                        )


                    ) {
                        Text(text = "1", fontSize = 40.sp, fontWeight = FontWeight.ExtraBold)
                    }

                    Button(
                        onClick = {
                            expression += 2.toString()
                            if(operator == null){
                                firstNumber += "2"
                            }else{
                                secondNumber += "2"
                            }
                        }, modifier = Modifier
                            .size(SCREEN_WIDTH / 4), colors = ButtonDefaults.textButtonColors(
                            backgroundColor = Color(0, 4, 50),
                            contentColor = Color.White
                        )


                    ) {
                        Text(text = "2", fontSize = 40.sp, fontWeight = FontWeight.ExtraBold)
                    }

                    Button(
                        onClick = {
                            expression += 3.toString()
                            if(operator == null){
                                firstNumber += "3"
                            }else{
                                secondNumber += "3"
                            }
                        }, modifier = Modifier
                            .size(SCREEN_WIDTH / 4), colors = ButtonDefaults.textButtonColors(
                            backgroundColor = Color(0, 4, 50),
                            contentColor = Color.White
                        )


                    ) {
                        Text(text = "3", fontSize = 40.sp, fontWeight = FontWeight.ExtraBold)
                    }

                    Button(
                        onClick = {
                            operator = '+'
                            dot = 0
                            expression = "$firstNumber + "
                        }, modifier = Modifier
                            .size(SCREEN_WIDTH / 4), colors = ButtonDefaults.textButtonColors(
                            backgroundColor = Color(0, 4, 90),
                            contentColor = Color(164, 92, 18)
                        )


                    ) {
                        Text(text = "+", fontSize = 40.sp, fontWeight = FontWeight.ExtraBold)
                    }


                }

                // Button 0, ., =
                Row(
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Button(
                        onClick = {
                            expression += 0.toString()
                            if(operator == null){
                                firstNumber += "0"
                            }else{
                                secondNumber += "0"
                            }
                        }, modifier = Modifier
                            .width(SCREEN_WIDTH / 2)
                            .height(SCREEN_WIDTH / 4), colors = ButtonDefaults.textButtonColors(
                            backgroundColor = Color(0, 4, 50),
                            contentColor = Color.White
                        )


                    ) {
                        Text(text = "0", fontSize = 40.sp, fontWeight = FontWeight.ExtraBold)
                    }

                    Button(
                        onClick = {
                            if(dot == 0) {
                                if (operator == null) {
                                    firstNumber = "$firstNumber."
                                    dot = 1
                                    expression = firstNumber
                                }
                                else{
                                    secondNumber = "$secondNumber."
                                    dot = 1
                                    expression = "$firstNumber $operator $secondNumber"
                                }
                            }
                        }, modifier = Modifier
                            .size(SCREEN_WIDTH / 4), colors = ButtonDefaults.textButtonColors(
                            backgroundColor = Color(0, 4, 50),
                            contentColor = Color.White
                        )


                    ) {
                        Text(text = ".", fontSize = 45.sp, fontWeight = FontWeight.ExtraBold)
                    }

                    Button(
                        onClick = {
                            when (operator){
                                '+' -> result = firstNumber.toFloat() + secondNumber.toFloat()
                                '-' -> result = firstNumber.toFloat() - secondNumber.toFloat()
                                'x' -> result = firstNumber.toFloat() * secondNumber.toFloat()
                                '/' -> result = firstNumber.toFloat() / secondNumber.toFloat()
                                '%' -> result = firstNumber.toFloat() % secondNumber.toFloat()
                            }
                            expression = "$expression = $result"
//                            Toast.makeText(context, "$result", Toast.LENGTH_SHORT).show()
                        }, modifier = Modifier
                            .size(SCREEN_WIDTH / 4), colors = ButtonDefaults.textButtonColors(
                            backgroundColor = Color(0, 4, 90),
                            contentColor = Color(164, 92, 18)
                        )


                    ) {
                        Text(text = "=", fontSize = 40.sp, fontWeight = FontWeight.ExtraBold)
                    }


                }
            }

        }

        Text("GDSC CALCULATOR v1", color = Color.White
            , modifier = Modifier.padding(110.dp, 320.dp),
            fontWeight = FontWeight.ExtraBold
        )

        Text(expression,
            modifier = Modifier.size(80.dp).padding(0.dp, 0.dp, 20.dp, 0.dp),
            color = Color.Black,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 60.sp,
            textAlign = TextAlign.Right
        )


    }
}

@Preview
@Composable
fun CalculatorPreview(){
    Calculator()
}