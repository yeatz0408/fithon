export const Carousel = () => {
    return (
        <div className='container mt-5' style={{ height:550 }}>
            <div className='homepage-carousel-title'>
                <h3>夜遅くまで読んでしまう本</h3>
            </div>
            <div id='carouselExampleControls' className='carousel carousel-dark slide mt-5 d-none d-lg-block' data-bs-in='false'>
                {/* Desktop */}
                <div className='carousel-inner'>
                    <div className='carousel-item active'>
                        <div className='row d-flex justify-content-center align-items-center'>
                            <div className='col-xs-6 col-sm-6 col-md-4 col-lg-3 mb-3'>
                                <div className='text-center'>
                                    <img src={require('./../../Images/BooksImages/FitnessForDummies.jpg')} 
                                        width='151' height='233' alt="本"></img>
                                    <h6 className='mt-2'>本</h6>
                                    <p>Fitness For Dummies</p>
                                    <a className='btn main-color text-white' href='#'>予約</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <button className='carousel-control-prev' type='button' data-bs-target='#carouselExampleControls' data-bs-slide='prev'>
                        <span className='carousel-control-prev-icon' aria-hidden='true'></span>
                        <span className='visually-hidden'>次</span>
                    </button>
                </div>

                {/* Mobile */}
                <div className='d-lg-none mt-3'>
                    <div className='row d-flex justify-content-center align-items-center'>
                        <img src={require('./../../Images/BooksImages/FitnessForDummies.jpg')} width='151' height='233' alt="本"/>
                        <h6 className='mt-2'>
                            <b>本</b>
                        </h6>
                        <p>Fitness For Dummies</p>
                        <a className='btn main-color text-white' href='#'>予約</a>
                    </div>
                </div>
                <div className='homepag-carousel-title mt-3'>
                    <a className='btn btn-outline-secondary btn-lg' href='#'>もっと見る</a>
                </div>
            </div>
        </div>
    )
}
