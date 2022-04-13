package com.sonu.stockmarketapp.domain.repository

import com.sonu.stockmarketapp.domain.model.CompanyInfo
import com.sonu.stockmarketapp.domain.model.CompanyListing
import com.sonu.stockmarketapp.domain.model.IntradayInfo
import com.sonu.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {
    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>

}