export const LibraryServices = () => {
    return(
        <div className='container my-5'>
            <div className='row p-4 align-items-center border shadow-lg'>
                <div className='col-log-7 p-3'>
                    <h1 className='display-4 fw-bold'>
                        探してる本がございませんか？
                    </h1>
                    <p className='lead'>
                        探す本がなければ私たちにメールを送ってください。
                        最善を尽くしてお手伝いいたします!
                    </p>
                    <div className='d-grid gap-2 justify-content-md-start mb-4 mb-lg-3'>
                        <a className='btn main-color btn-lg text-white' href='#'>
                            会員登録
                        </a>
                    </div>
                </div>
                <div className='col-lg-4 offset-lg-1 shadow-lg lost-image'></div>
            </div>
        </div>
    )
}