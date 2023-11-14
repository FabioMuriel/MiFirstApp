package com.example.fabiomaster.imccalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.example.fabiomaster.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import java.text.DecimalFormat

class imcCalculatorActivity : AppCompatActivity() {

    private var isMaleSelected: Boolean = true;
    private var isFemaleSelected: Boolean = false;
    private var currentWeight: Int = 60;
    private var currentAge: Int = 30;

    private lateinit var viewMale: CardView;
    private lateinit var viewFemale: CardView;
    private lateinit var tvHeight: TextView;
    private lateinit var rsHeight: RangeSlider;
    private lateinit var btnSubtractWeight: FloatingActionButton;
    private lateinit var btnPlusWeight: FloatingActionButton;
    private lateinit var tvWeight: TextView;
    private lateinit var btnSubtractAge: FloatingActionButton;
    private lateinit var btnPlusAge: FloatingActionButton;
    private lateinit var tvAge: TextView;
    private lateinit var btnCalculate: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calculator)
        initComponent()
        initListeners()
        initUi()
    }

    private fun initComponent() {
        viewMale = findViewById(R.id.viewMale);
        viewFemale = findViewById(R.id.viewFemale);
        tvHeight = findViewById(R.id.tvHeight);
        rsHeight = findViewById(R.id.rsHeight);
        btnSubtractWeight = findViewById(R.id.btnSubtractWeight)
        btnPlusWeight = findViewById(R.id.btnPlusWeight)
        tvWeight = findViewById(R.id.tvWeight)
        btnSubtractAge = findViewById(R.id.btnSubtractAge)
        btnPlusAge = findViewById(R.id.btnPlusAge)
        tvAge = findViewById(R.id.tvAge)
        btnCalculate = findViewById(R.id.btnCalculate);
    }

    private fun initListeners() {
        viewMale.setOnClickListener {
            if (!isMaleSelected) {
                changeGender()
                setGenderColor()
            }
        }
        viewFemale.setOnClickListener {
            if (!isFemaleSelected) {
                changeGender()
                setGenderColor()
            }
        }

        rsHeight.addOnChangeListener { _, value, fromUser ->
            val df = DecimalFormat("#.##")
            val result = df.format(value)
            tvHeight.text = "$result Cm";
        }

        btnPlusWeight.setOnClickListener {
            currentWeight++
            setWeight()
        }
        btnSubtractWeight.setOnClickListener {
            currentWeight--
            setWeight()
        }

        btnPlusAge.setOnClickListener {
            currentAge++
            setAge()
        }
        btnSubtractAge.setOnClickListener {
            currentAge--
            setAge()
        }

        btnCalculate.setOnClickListener {  }
    }

    private fun setAge() {
        tvAge.text = currentAge.toString()
    }

    private fun setWeight() {
        tvWeight.text = currentWeight.toString()
    }

    private fun changeGender() {
        isMaleSelected = !isMaleSelected;
        isFemaleSelected = !isFemaleSelected;
    }

    private fun setGenderColor() {
        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))
    }

    private fun getBackgroundColor(isSelectedComponent: Boolean): Int {
        val colorReference = if (isSelectedComponent) {
            R.color.background_component_selected

        } else {
            R.color.background_component
        }

        return ContextCompat.getColor(this, colorReference)
    }

    private fun initUi() {
        setGenderColor()
        setWeight()
        setAge()
    }

}