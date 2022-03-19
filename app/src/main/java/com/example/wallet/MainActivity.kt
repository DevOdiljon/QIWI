package com.example.wallet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var rv_advertising: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }
    fun initViews(){
        recyclerView = findViewById(R.id.recyclerView)
        rv_advertising = findViewById(R.id.rv_advertising)
        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(rv_advertising)

        refreshAdapter(getAllPayment())
        advertisingAdapter(getAllAdverising())
    }

    private fun advertisingAdapter(items: ArrayList<Advertising>) {
        var adapter = AdvertisingAdapter(this, items)
        rv_advertising.adapter = adapter
    }

    private fun getAllAdverising(): ArrayList<Advertising> {
        var items = ArrayList<Advertising>()

        items.add(Advertising("Повтояйте любой платеж из Истории в один клик", R.drawable.chicken))
        items.add(Advertising("Повтояйте любой платеж из Истории в один клик", R.drawable.chicken))
        items.add(Advertising("Повтояйте любой платеж из Истории в один клик", R.drawable.chicken))
        items.add(Advertising("Повтояйте любой платеж из Истории в один клик", R.drawable.chicken))
        items.add(Advertising("Повтояйте любой платеж из Истории в один клик", R.drawable.chicken))
        items.add(Advertising("Повтояйте любой платеж из Истории в один клик", R.drawable.chicken))
        items.add(Advertising("Повтояйте любой платеж из Истории в один клик", R.drawable.chicken))

        return items
    }

    private fun refreshAdapter(items: ArrayList<Payment>) {
        var adapter = PaymentAdapter(this, items)
        recyclerView.adapter = adapter
    }

    private fun getAllPayment(): ArrayList<Payment> {
        var items = ArrayList<Payment>()

        items.add(Payment("На QIWI Кошелек", R.drawable.qiwi_wallet))
        items.add(Payment("На QIWI Кошелек", R.drawable.qiwi_wallet))
        items.add(Payment("На QIWI Кошелек", R.drawable.qiwi_wallet))
        items.add(Payment("На QIWI Кошелек", R.drawable.qiwi_wallet))
        items.add(Payment("На QIWI Кошелек", R.drawable.qiwi_wallet))
        items.add(Payment("На QIWI Кошелек", R.drawable.qiwi_wallet))
        items.add(Payment("На QIWI Кошелек", R.drawable.qiwi_wallet))
        items.add(Payment("На QIWI Кошелек", R.drawable.qiwi_wallet))

        return items
    }
}