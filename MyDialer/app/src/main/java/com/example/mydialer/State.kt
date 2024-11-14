package com.example.mydialer

data class State(
    var contacts: List<Contact> = emptyList(),
    var filteredContacts: List<Contact> = emptyList()
)
