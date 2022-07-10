package com.example.twitterme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.twitterme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var imbLike:ImageButton
    lateinit var tvLike:TextView
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        imbLike=findViewById(R.id.imbLike)
//        tvLike=findViewById(R.id.tvLike)

//        imbLike.setOnClickListener{

//        }

//        binding.imgLike.setOnClickListener{}

        tweeterss()
    }
    fun tweeterss(){

            var person=Tweets("","Shamim","shamibouya@gmail","Life is great Hang tight.","","","",4,5,6)
            var person2=Tweets("","bizwa","bizwa@gmail.com","Patel is a great place to start.","","","",6,3,1)
            var person3=Tweets("","Sanskar","@sanskar","Just finished my workout.","","","",64,6,89)
            var person4=Tweets("","Oft","@oftyko.com","I have lots of accuracy in my code.","","","",3,5,56)
            var person5=Tweets("","Muftin","@Muftinblio","People should be careful to not to hurt others.","","","",4,675,89)
            var person6=Tweets("","Denzel Washington","@denzy","Fail again,fail hard,fail better.","","","",45,456,500)
            var person7=Tweets("","Leila Janna","@jnlah","I believe that ethical AI is possible.","","","",900,706,800)
            var person8=Tweets("","Klaus Mikaelson","@klausm","Family is always and forever.","","","",700,700,500)
            var person9=Tweets("","Charlene Hunter","@carlene","Fail again,fail hard,fail better.","","","",400,300,672)
            var person10=Tweets("","Yetunde dada","@yeyetund","Being Full stack is quite a great thing.","","","",67,4,50)
            var person11=Tweets("","Viola Davis","@viola","Becoming,my new book.","","","",900,4,50)
            var person12=Tweets("","Gonzolato","@gonz0","Stop doubting yourself.","","","",6,78,67)

        var personTweet= listOf(person,person2,person3,person4,person5,person6,person7,person8,person9,person10,person11,person12)
            var tweetAdapter=TweetingAdapterActivity(personTweet)
            binding.rvTweets.layoutManager= LinearLayoutManager(this)
            binding.rvTweets.adapter=tweetAdapter
        }

    }

