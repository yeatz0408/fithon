import React from 'react'

export const ReturnBook = () => {
    return (
        <div className='col-xs-6 col-sm-6 col-md-4 col-lg-3 mb-3'>
            <div className='text-center'>
                <img src={require('./../../../Images/BooksImages/FitnessForDummies.jpg')}
                    width='151' height='233' alt="本"></img>
                <h6 className='mt-2'>本</h6>
                <p>Fitness For Dummies</p>
                <a className='btn main-color text-white' href='#'>予約</a>
            </div>
        </div>
    );
}
