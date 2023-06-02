package com.example.uts_if6_10120222_martinuscelvyn.ui.profile

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.uts_if6_10120222_martinuscelvyn.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class ProfileFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn_ig = view.findViewById<View>(R.id.btn_ig)
        val btn_wa = view.findViewById<View>(R.id.btn_wa)
        val btn_email = view.findViewById<View>(R.id.btn_email)

        btn_ig.setOnClickListener {
            openSocialMedia("https://instagram.com/martinuscelvyn_s?igshid=MzNlNGNkZWQ4Mg==")
        }
        btn_wa.setOnClickListener {
            openWhatsApp()
        }
        btn_email.setOnClickListener {
            openEmail()
        }
    }

    private fun openSocialMedia(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
    private fun openWhatsApp() {
        val phoneNumber = "+62 812-2447-1934" // Nomor telepon yang akan diarahkan ke WhatsApp
        val url = "https://api.whatsapp.com/send?phone=+62 812-2447-1934"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
    private fun openEmail() {
        val email = "martinus.10120222@mahasiswa.unikom.ac.id" // Alamat email yang akan dituju
        val subject = "Subject email" // Subjek email
        val uri = Uri.parse("mailto:$email?subject=${Uri.encode(subject)}")
        val intent = Intent(Intent.ACTION_SENDTO, uri)
        startActivity(intent)



    }
}









