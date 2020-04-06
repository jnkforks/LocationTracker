package com.locationtracker.repository

import com.locationtracker.sources.cache.data.LocationEntity
import com.locationtracker.network.response.ReverseGeoEncodeResponse
import io.reactivex.Completable
import io.reactivex.Observable

interface LocationRepository {
    fun getAllLocationData() : Observable<List<LocationEntity>>
    fun getLocationListByDate(timeStamp : String) : Observable<List<LocationEntity>>
    fun addLocationRepository(data: LocationEntity) : Completable
    fun getReverseGeoEncodeData(lat : String , lng : String) : Observable<ReverseGeoEncodeResponse>
}