package com.example.appcadastro

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.appcadastro.ui.theme.AppCadastroTheme
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appcadastro.ui.theme.Darkblue
import com.example.appcadastro.ui.theme.Lightblue
import com.example.appcadastro.ui.theme.Pink40


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppCadastroTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    appPreview()
                }
            }
        }
    }
}

@Composable
fun ProdutoItem(){
    var nome by remember { mutableStateOf("") }
    var telefone by remember { mutableStateOf("")}
    var curso by remember { mutableStateOf("") }
    var serie by remember { mutableStateOf("") }
    var observacao by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(
            modifier = Modifier
                .height(180.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Darkblue, Lightblue
                        )
                    )
                )
                .fillMaxWidth()
        )
        {
            Image(
                painter = painterResource(R.drawable.avatr_woman),
                contentDescription = "avatar image",
                contentScale =  ContentScale.Crop,
                modifier = Modifier
                    .offset(y = 70.dp)
                    .size(150.dp)
                    .clip(shape = CircleShape)
                    .align(Alignment.Center)
            )
        }
        Spacer(Modifier.height(55.dp))
        Column(
            modifier = Modifier.padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Cadastre-se",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight(500),
                fontSize = 35.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally) // Centraliza o título
            )
            Spacer(Modifier.height(25.dp))
            Text(
                text = "Nome: ",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight(250),
                fontSize = 25.sp,
                modifier = Modifier.align(Alignment.Start)
            )
            Spacer(Modifier.height(15.dp))
            TextField(
                value = nome,
                onValueChange = { nome = it },
                label = { Text("Digite seu nome completo") },
                maxLines = 2,
                modifier = Modifier.fillMaxWidth(),
            )
            Spacer(Modifier.height(20.dp))
            Text(
                text = "Telefone: ",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight(250),
                fontSize = 25.sp,
                modifier = Modifier.align(Alignment.Start)
            )
            Spacer(Modifier.height(15.dp))
            TextField(
                value = telefone,
                onValueChange = { telefone = it},
                label = { Text("Digite o telefone...") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(Modifier.height(20.dp))
            Text(
                text = "Curso: ",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight(250),
                fontSize = 25.sp,
                modifier = Modifier.align(Alignment.Start)
            )
            Spacer(Modifier.height(15.dp))
            TextField(
                value = curso,
                onValueChange = { curso = it},
                label = { Text("Digite o nome do curso")},
                maxLines = 2,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(Modifier.height(20.dp))
            Text(
                text = "Série: ",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight(250),
                fontSize = 25.sp,
                modifier = Modifier.align(Alignment.Start)
            )
            Spacer(Modifier.height(15.dp))
            TextField(
                value = serie,
                onValueChange = {serie = it},
                label= { Text("Digite o número da sua série") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                maxLines = 2,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(Modifier.height(20.dp))
            Text(
                text = "Observação: ",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight(250),
                fontSize = 25.sp,
                modifier = Modifier.align(Alignment.Start)
            )
            Spacer(Modifier.height(15.dp))
            TextField(
                value = observacao,
                onValueChange = { observacao = it },
                label = { Text("Digite suas observações") },
                maxLines = 3,
                modifier = Modifier.fillMaxWidth()
            )
        }
        Column(
            modifier = Modifier.padding(vertical = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = {
                    nome = ""
                    telefone = ""
                    curso = ""
                    serie = ""
                    observacao = ""
                },
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(text = "Cadastrar")
            }
        }
    }
}

@Preview
@Composable
fun appPreview() {
    AppCadastroTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            ProdutoItem()
        }
    }
}