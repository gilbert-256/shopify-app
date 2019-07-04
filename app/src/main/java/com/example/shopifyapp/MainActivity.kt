package com.example.shopifyapp

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_ticket.view.*

class MainActivity : AppCompatActivity() {
   var listProducts=ArrayList<Productinfo>()
    var adapter:MyProductAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter=MyProductAdapter(listProducts)
        LstItems.adapter=adapter

        fun loadURLonline(){
         listProducts.add(Productinfo("Leather Jacket","45.98 EUR","http://www.zara.com"))
            listProducts.add(Productinfo("Leather Tote Bag","79.95 EUR","http://www.zara.com"))
            listProducts.add(Productinfo("Pinafore Dress","29.95 EUR","http://www.zara.com"))
            listProducts.add(Productinfo("Floral Top","25.95 EUR","http://www.zara.com"))
            listProducts.add(Productinfo("T-shirt","15.95 EUR","http://www.zara.com"))
            listProducts.add(Productinfo("Jogger Trouser","19.95 EUR","http://www.zara.com"))
            listProducts.add(Productinfo("Pastel leather shoe","49.95 EUR","http://www.zara.com"))
            listProducts.add(Productinfo("Necklace with knots","9.99 EUR","http://www.zara.com"))
            listProducts.add(Productinfo("Rolex Watch","45.98 EUR","http://www.zara.com"))
            listProducts.add(Productinfo("Basic Sweatershirt","7.98 EUR","http://www.zara.com"))
        }



          }

inner class MyProductAdapter:BaseAdapter {
    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    var MylistProducts=ArrayList<Productinfo>()
    constructor(listProducts:ArrayList<Productinfo>):super() {
        this.MylistProducts=MylistProducts
    }

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
        val myview=layoutInflater.inflate(R.layout.item_ticket,null)
        val product=this.MylistProducts[position]
        myview.tvproduct.text=product.productname
        myview.tvprice.text=product.productprice
        myview.bubuy.setOnClickListener(View.OnClickListener{

        })
        return myview




    }

    override fun  getItem(Item: Int): Any {
        return this.MylistProducts[Item]
    }

    override fun getCount(): Int {
        return this.MylistProducts.size
    }
    }

        }




