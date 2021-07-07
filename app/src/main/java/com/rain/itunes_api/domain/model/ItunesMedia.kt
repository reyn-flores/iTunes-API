package com.rain.itunes_api.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

//A domain model which will be observed by the framework
@Parcelize
data class ItunesMedia(
    val artistName: String?,
    val artworkUrl100: String?,
    val artworkUrl30: String?,
    val artworkUrl60: String?,
    val collectionArtistId: Int?,
    val collectionArtistViewUrl: String?,
    val collectionCensoredName: String?,
    val collectionExplicitness: String?,
    val collectionHdPrice: Double?,
    val collectionId: Int?,
    val collectionName: String?,
    val collectionPrice: Double?,
    val collectionViewUrl: String?,
    val contentAdvisoryRating: String?,
    val country: String?,
    val currency: String?,
    val discCount: Int?,
    val discNumber: Int?,
    val hasITunesExtras: Boolean?,
    val kind: String?,
    val longDescription: String?,
    val previewUrl: String?,
    val primaryGenreName: String?,
    val releaseDate: String?,
    val shortDescription: String?,
    val trackCensoredName: String?,
    val trackCount: Int?,
    val trackExplicitness: String?,
    val trackHdPrice: Double?,
    val trackHdRentalPrice: Double?,
    val trackId: Int?,
    val trackName: String?,
    val trackNumber: Int?,
    val trackPrice: Double?,
    val trackRentalPrice: Double?,
    val trackTimeMillis: Int?,
    val trackViewUrl: String?,
    val wrapperType: String?
) : Parcelable